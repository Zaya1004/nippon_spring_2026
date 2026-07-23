const main = document.querySelector('main');

// menu
const menuUlElement = document.createElement('ul');
// class menu add
menuUlElement.classList.add('menu');

const liElementCollection = ['Home', 'FIFA2026', 'Policy', 'Economy', 'Society', 'Health']

for (let i = 0; i < liElementCollection.length; i++) {
    const liElement = document.createElement('li');
    liElement.innerText = liElementCollection[i];
    liElement.classList.add('sub-menu');
    menuUlElement.appendChild(liElement);
}
console.log(menuUlElement);

// add to main element
main.appendChild(menuUlElement);

const asideBtn = document.createElement('button');
asideBtn.innerHTML = 'Aside add';

asideBtn.addEventListener('click', () => {
    const isAsideElementExists = main.querySelector("aside.aside");


    if (!isAsideElementExists) {
        const asideElement = document.createElement('aside');
        asideElement.innerText = 'Aside menu';
        asideElement.classList.add('aside');
        main.appendChild(asideElement);
    } 


});
main.appendChild(asideBtn);

const articleElement = document.createElement('article');
articleElement.textContent = 'Main article';
main.appendChild(articleElement);


